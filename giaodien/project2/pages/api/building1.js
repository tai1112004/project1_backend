// pages/api/building1.js
import Cors from 'cors'
import initMiddleware from '../../lib/init-middleware'

// Initialize the cors middleware
const cors = initMiddleware(
  Cors({
    methods: ['GET', 'POST', 'OPTIONS'],
    origin: '*', // Hoặc bạn có thể chỉ định các origin cụ thể
  })
)

export default async function handler(req, res) {
  // Run cors
  await cors(req, res)

  // Rest of your API logic
  res.json({ message: 'Hello Everyone!' })
}